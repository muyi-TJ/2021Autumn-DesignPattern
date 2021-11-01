package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 外观类
 */
public class SecurityCheckFacade
{
    PersonalSecurityCheck personalSecurityCheck = new PersonalSecurityCheck();
    TicketCheck ticketCheck = new TicketCheck();
    CertificateCheck certificateCheck = new CertificateCheck();
    PersonalBelongingCheck personalBelongingCheck = new PersonalBelongingCheck();

    /**
     * 普通游客安检流程
     */
    public void ordinaryCustomerSecurityCheck()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "普通游客："
        );
        ticketCheck.ticketCheck();
        personalBelongingCheck.checkPersonalBelongings();
        personalSecurityCheck.personalSecurityCheck();
    }

    /**
     * 特殊顾客（购买了凭证件打折的票种)安检流程
     */
    public void specialCustomerSecurityCheck()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "特殊游客："
        );
        ticketCheck.ticketCheck();
        certificateCheck.checkCertificate();
        personalBelongingCheck.checkPersonalBelongings();
        personalSecurityCheck.personalSecurityCheck();
    }
}
