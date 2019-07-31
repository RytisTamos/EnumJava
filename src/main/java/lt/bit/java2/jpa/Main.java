package lt.bit.java2.jpa;

import lt.bit.java2.jpa.entities.Employee;

import javax.persistence.EntityManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOG.info("Started");

        EntityManager em = EntityManagerHelper.entityManager();

        Employee employee = em.find(Employee.class, 10004);
        System.out.println(employee.getFullName());

        employee.getTitles().forEach(title -> {
            System.out.println(title.getTitle());
        });

    //public static void main(String[] args) {
        //System.out.println("Test");

        //EntityManager em = EntityManagerHelper.entityManager();

        //Employee employee = em.find(Employee.class, 10003);
        //System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getGender() +
        //        " " + employee.getBirthDate());

        //employee.setFirstName("Jonas");
        //em.persist(employee);

        //System.out.println(Gender.M.ordinal());
        //System.out.println(Gender.M.name());
        //System.out.println(Gender.M.toString());

        //TitlePK titlePK = new TitlePK();
        //titlePK.setEmpNo(10001);
        //titlePK.setTitle("Senior Engineer");
        //titlePK.setFromDate(LocalDate.of(1986, 6, 26));
        //Title title = em.find(Title.class);



    }
}
