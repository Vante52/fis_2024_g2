package org.musify.service;

import com.vonage.client.VonageClient;
import com.vonage.client.sms.MessageStatus;
import com.vonage.client.sms.SmsSubmissionResponse;
import com.vonage.client.sms.messages.TextMessage;

public class VonageSmsService {

    private final VonageClient client;

    public VonageSmsService() {
        String apiKey = System.getenv("VONAGE_API_KEY");
        String apiSecret = System.getenv("VONAGE_API_SECRET");

        if (apiKey == null || apiSecret == null) {
            throw new IllegalArgumentException("Vonage API credentials not set in environment variables");
        }

        this.client = VonageClient.builder().apiKey(apiKey).apiSecret(apiSecret).build();
    }

    public boolean enviarSMS(String numeroDestino, String mensaje) {
        TextMessage message = new TextMessage("Musify", numeroDestino, mensaje);
        SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);

        return response.getMessages().get(0).getStatus() == MessageStatus.OK;
    }
}
