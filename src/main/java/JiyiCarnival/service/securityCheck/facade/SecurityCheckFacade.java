package JiyiCarnival.service.securityCheck.facade;

/**
 * @author Caviar011230
 * 外观类
 */
public class SecurityCheckFacade {
    PersonalSecurityCheck personalSecurityCheck = new PersonalSecurityCheck();
    TicketCheck ticketCheck = new TicketCheck();
    CertificateCheck certificateCheck = new CertificateCheck();
    PersonalBelongingCheck personalBelongingCheck = new PersonalBelongingCheck();
    public void ordinaryCustomerSecurityCheck(){
        System.out.println("普通游客：");
        ticketCheck.ticketCheck();
        personalBelongingCheck.checkPersonalBelongings();
        personalSecurityCheck.personalSecurityCheck();
    }
    public void specialCustomerSecurityCheck(){
        System.out.println("特殊游客：");
        ticketCheck.ticketCheck();
        certificateCheck.checkCertificate();
        personalBelongingCheck.checkPersonalBelongings();
        personalSecurityCheck.personalSecurityCheck();
    }
}
