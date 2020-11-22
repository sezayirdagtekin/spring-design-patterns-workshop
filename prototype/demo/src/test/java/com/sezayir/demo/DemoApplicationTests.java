package com.sezayir.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sezayir.demo.proto.ProtoFalse;
import com.sezayir.demo.proto.ProtoTrue;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ProtoFalse f1;

	@Autowired
	ProtoFalse f2;

	@Autowired
	ProtoTrue p1;

	@Autowired
	ProtoTrue p2;

	@Test
	public void testProtoTypeSame() {
		Assert.assertSame(f1, f2);
	}

	@Test
	public void testProtoTypeNotSame() {
		Assert.assertNotSame(p1, p2);
	}

}
