package HelpOthers;

class Ticket{

    private int ticketId;
    private int price;
    static int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        if(availableTickets>0)
            Ticket.availableTickets = availableTickets;
    }

    public int calculateTicketCost(int noofTickets){

        int cost;
        if(availableTickets<noofTickets)
            return -1;
        System.out.println("Available Tickets:" + getAvailableTickets() + "\n");
        cost = getPrice() * noofTickets;
        availableTickets = (getAvailableTickets()-noofTickets);
        return cost;
    }
}
