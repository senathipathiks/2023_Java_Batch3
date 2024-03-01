package com.jsp.controller;


import static org.assertj.core.api.Assertions.assertThat;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
 class UserMainTest{

	@InjectMocks
	UserMain underTest;

	@Test
	 void testUpdateUser() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInit() throws Exception {
	// given
	// when
	underTest.init();
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoGet() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doGet(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoPost() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doPost(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testListUser() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.listUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testUpdateUser_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowEditForm() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.showEditForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDeleteUser() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.deleteUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInsertUser() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.insertUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowNewForm() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	UserMain.showNewForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testUpdateUser_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInit_1() throws Exception {
	// given
	// when
	underTest.init();
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoGet_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doGet(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoPost_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doPost(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testListUser_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.listUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testUpdateUser_3() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowEditForm_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.showEditForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDeleteUser_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.deleteUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInsertUser_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.insertUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowNewForm_1() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	UserMain.showNewForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testUpdateUser_4() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInit_2() throws Exception {
	// given
	// when
	underTest.init();
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoGet_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doGet(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDoPost_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.doPost(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testListUser_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.listUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testUpdateUser_5() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.updateUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowEditForm_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.showEditForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testDeleteUser_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.deleteUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testInsertUser_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	underTest.insertUser(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	 void testShowNewForm_2() throws Exception {
	// given
	HttpServletRequest request = TestValueFactory.getValueForType(HttpServletRequest.class, "request");
	HttpServletResponse response = TestValueFactory.getValueForType(HttpServletResponse.class, "response");
	// when
	UserMain.showNewForm(request, response);
	// then
	// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
	// verify(mock).methodcall();
	// assertThat(TestUtils.objectToJson(param)).isEqualTo(TestUtils.readTestFile("someMethod/ParamType_updated.json"));
	// assertThrows(SomeException.class, () -> underTest.someMethod());
	} 
}