package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import java.sql.SQLException;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class sold_ticket_request extends _connection {
    public void getAllSoldTicket() throws SQLException{
        List<sold_ticket> sold_tickets = new sold_ticket_DAO().getAllSoldTicket();
 
        for (sold_ticket sold_ticket : sold_tickets) {
            System.out.println(sold_ticket.getTicket_id()+" "+sold_ticket.getFrom()+" "+sold_ticket.getDirection()+" "+sold_ticket.getTo()
            +" "+sold_ticket.getSold_ticket_hour()+" "+sold_ticket.getSold_ticket_week()+" "+sold_ticket.getSold_ticket_mounth());
        }
        

        connection.close();
    }
}
