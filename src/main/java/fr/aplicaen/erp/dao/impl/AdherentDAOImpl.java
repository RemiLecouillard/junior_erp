package fr.aplicaen.erp.dao.impl;

import fr.aplicaen.erp.bean.Adherent;
import fr.aplicaen.erp.dao.AdherentDAO;
import fr.aplicaen.erp.kernel.BaseDAO;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdherentDAOImpl extends BaseDAO implements AdherentDAO {

    @Override
    public List<Adherent> getAllAdherents() {
        System.out.println("salut :)");
        Session session = this.sessionFactory.openSession();

        Adherent ad = session.load(Adherent.class, 0);
        System.out.println(ad.getNom());
        return null;
    }
}
