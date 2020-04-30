package com.patterns.pattern.adapter.mail;

import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailToSend;

public class ExchangeGoogleMailServerAdapter implements ExchangeMailServer {

    private final GoogleMailServer googleMailServer;

    public ExchangeGoogleMailServerAdapter(GoogleMailServer googleMailServer) {
        this.googleMailServer = googleMailServer;
    }

    @Override
    public String[] listUnreadEmailSenders() {
        return googleMailServer
                .fetchUnreadEmailsDetails()
                .keySet()
                .toArray(String[]::new);
    }

    @Override
    public String getLatestMailContent() {
        return googleMailServer.getLastMailBody();
    }

    @Override
    public void sendEmail(String recipientEmailAddress, String title, String body) {
        GoogleMailToSend googleMailToSend = googleMailServer.composeEmail(recipientEmailAddress, title, body);
        googleMailServer.sendEmail(googleMailToSend);
    }
}
