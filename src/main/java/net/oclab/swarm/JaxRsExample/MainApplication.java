package net.oclab.swarm.JaxRsExample;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class MainApplication {
	public static void main(String ... args) throws Exception {
		Swarm swarm = new Swarm();

		JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class, "helloSwarm-app.war");
        deployment.addClass(HelloResource.class);

        swarm
				.start()
                .deploy(deployment);
	}
}
