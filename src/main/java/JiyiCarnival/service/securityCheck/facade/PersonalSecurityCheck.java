package JiyiCarnival.service.securityCheck.facade;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 人身安检
 */

public class PersonalSecurityCheck {
    /**
     * 人身安检
     */
    public void personalSecurityCheck(){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客进行了人身安检"
        );
    }
}
