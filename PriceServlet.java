 @Override
    protected void dopost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String StartStation = request.getParameter("StartStaion");
        String EndStation = request.getParameter("EndStaion");
        
        if(StartStation.equals("Fort")&&(EndStation.equals("Kurunegala")))
        {
            out.println("2nd class=Rs 190.00");
            out.println("3rd class=Rs 105.00");
            
        }
        else if(StartStation.equals("Kurunegala")&&(EndStation.equals("Fort")))
        {
            out.println("2nd class=Rs 190.00");
            out.println("3rd class=Rs 105.00");
        }
        
        
        
        else if(StartStation.equals("Fort")&&(EndStation.equals("Peradeniya")))
        {
            out.println("1st class=Rs 340.00");
            out.println("2nd class=RS 220.00");
            out.println("3rd class=Rs 120.00");
        }
        
         else if(StartStation.equals("Peradeniya")&&(EndStation.equals("Fort")))
        {
            out.println("3st class=Rs 340.00");
            out.println("2nd class=RS 220.00");
            out.println("3rd class=Rs 120.00");
        }
        
        
        else if(StartStation.equals("Fort")&&(EndStation.equals("Chillaw")))
        {
            out.println("2nd class=Rs 170.00");
            out.println("3rd class=Rs 95.00");
            
        }
        
         else if(StartStation.equals("Chillaw")&&(EndStation.equals("Fort")))
        {
            out.println("2nd class=Rs 170.00");
             out.println("3rd class=Rs 95.00");
            
        }
        
        
        else if(StartStation.equals("Fort")&&(EndStation.equals("Galle")))
        {
            out.println("2nd class=Rs 220.00");
            out.println("3rd class=Rs 120.00");
            
        }
        
        else if(StartStation.equals("Galle")&&(EndStation.equals("Fort")))
        {
            out.println("2nd class=Rs 220.00");
            out.println("3rd class=Rs 120.00");
            
        }
        
        
 
        else if(StartStation.equals("Kurunegala")&&(EndStation.equals("Galle")))
        {
            out.println("2nd class=Rs 430.00");
            out.println("3rd class=Rs 275.00");
        }
       
        else if(StartStation.equals("Galle")&&(EndStation.equals("Kurunegala")))
        {
            out.println("2nd class=Rs 430.00");
            out.println("3rd class=Rs 275.00");
        }
       
        
        
        processRequest(request, response);
    }