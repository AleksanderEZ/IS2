/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kata4;

import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.model.Mail;
import Kata4.model.Histogram;
import Kata4.view.MailListReader;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", histogram);
        histogramDisplay.execute();
    }

}
