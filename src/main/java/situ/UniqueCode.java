package situ;

import java.util.Date;
import java.util.UUID;

public class UniqueCode {
	//生成UUID码
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	//利用当前时间生成一个随机整数
	public static String getUniqueCodeByDate() {
		String currentTime = new Date().getTime()+"";
		return currentTime;
	}

}
