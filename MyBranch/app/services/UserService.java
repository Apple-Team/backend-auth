package services;

import com.google.inject.Inject;
import models.Member;
import play.Logger;
import java.util.List;
import javax.persistence.TypedQuery;
import java.util.UUID;

import play.db.jpa.JPA;
import play.db.jpa.JPAApi;

public class UserService {

    private JPAApi jpaApi;

    @Inject
    public UserService (JPAApi jpaApi) {
        this.jpaApi=jpaApi;
    }
    public void createUser(Member user) {

        // TODO Save user in DB

    }

    public Member authenticate(String username, String password) {

        String q = "SELECT  m from Member m where m.username='"+username+"' and m.pwd='"+password+"'";
        Logger.debug(q);
        TypedQuery <Member> query = jpaApi.em().createQuery(q,Member.class);
        List<Member> members = query.getResultList();
        Logger.debug("{}",members);
        if(members.isEmpty()){
            return null;
        }
        Member member = members.get(0);
        member.setAuthToken(UUID.randomUUID().toString());
        return member;
    }

    public Member findUserByAuthToken(String authToken) {

     Logger.debug(authToken);
     String q = "SELECT m FROM Member m where m.authToken='" + authToken +"'";
     Logger.debug(q);
     TypedQuery<Member> query = jpaApi.em().createQuery(q,Member.class);
     Logger.debug("{}",query);
     List<Member> members = query.getResultList();
        Logger.debug("{}",members);
        if(members.isEmpty()){
            return null;
        }
        Member member = members.get(0);
        return member;

    }

    /*private Member hardCodedUser() {
        return new Member("mattias", "password", Member.Role.USER);
    }

    private Member hardCodedAdmin() {
        return new Member("admin", "admin", Member.Role.ADMIN);
    }*/

}
