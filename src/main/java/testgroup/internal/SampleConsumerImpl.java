/**
 * iPOJO sample service consumer.
 * REMOVE THIS CLASS AS SOON AS YOU UNDERSTOOD WHAT THIS FILE GOING TO DO.
 */
package testgroup.internal;

import testgroup.SampleIntf;

public class SampleConsumerImpl {
	private SampleIntf svc;
	void setService(SampleIntf service) {
		System.out.println("Got service");
		svc = service;
	}
	void clearService() {
		svc = null;
	}
	void start() {
		// do something
		System.out.println("started");
	}
	void stop() {
		// do something
		System.out.println("stopped");
	}
}
