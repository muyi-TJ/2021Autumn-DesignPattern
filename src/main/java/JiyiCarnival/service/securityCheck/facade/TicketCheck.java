package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 检票
 */
public class TicketCheck
{
    /**
     * 检票
     */
    public void ticketCheck()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客进行了检票"
        );
    }
}
