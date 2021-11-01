package JiyiCarnival.service.securityCheck.facade;

import JiyiCarnival.Output;
/**
 * @author Caviar011230
 * 证件检查
 */
public class CertificateCheck {
    /**
     * 证件检查
     */
    public void checkCertificate(){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "检查了顾客的相应证件"
        );
    }
}
