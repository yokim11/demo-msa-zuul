package com.demo.msa.zuul.common.constants;

public final class DefineHeader {

	public static final String ACCESS_TOKEN = "ACCESSTOKEN";
	public static final String DEVICE_ID = "DEVICEID";
	public static final String APP_VERSION = "APPVERSION";
	public static final String SWAGGER_ENABLE = "SWAGGERENABLE";
	public static final String OS_TYPE = "OSTYPE";

	public static final String ERROR_CODE = "ZUUL_RUNTIME_EXCEPTION";

	public static final String MAINTENANCE_CODE = "MAINTENANCE_EVENT_EXCEPTION";

	public static final String ENVIRONMENT_LIVE = "live";
	public static final String ENVIRONMENT_STAGE = "stage";
	public static final String ENVIRONMENT_DEV = "dev";

	private DefineHeader() {
		throw new AssertionError();
	}
}
