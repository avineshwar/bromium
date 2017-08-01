package com.hribol.bromium.demo.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hvrigazov on 09.07.17.
 */
@Path("/")
public class Resource {
    @GET
    @Path("http-queue.js")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        try {
            // Slow down response on purpose to demonstrate the race condition
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "\t\tconsole.log('Resource: http-queue.js loaded');\n" +
                "\t\tvar elemDiv = document.createElement('button');\n" +
                "\t\telemDiv.addEventListener('click', function() { this.innerHTML = 'I was clicked'});\n" +
                "\t\telemDiv.innerHTML = 'I was created when AJAX request was answered';\n" +
                "\t\telemDiv.id = \"ajax-button\";\n" +
                "\t\tdocument.body.appendChild(elemDiv);";
    }
}