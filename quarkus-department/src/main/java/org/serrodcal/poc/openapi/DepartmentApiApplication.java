package org.serrodcal.poc.openapi;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title="Department API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Example API Support",
                        url = "http://exampleurl.com/contact",
                        email = "techsupport@example.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class DepartmentApiApplication extends Application { }
