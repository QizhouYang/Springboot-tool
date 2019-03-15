package com.yqz.study.basic.exception;

/*
 *
 * @Description 错误编码类
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
public enum ErrorCode {

	E_00000("未知错误", "unknown error"),

	E_00001("新增错误", "add error"),

	E_00002("删除错误", "delete error"),

	E_00003("查询错误", "qurry error"),

	E_00004("更新错误", "update error"),

	E_00005("下载错误", "download error"),

	E_00006("商品添加成功", "Product add successed"),

	E_00007("该商品不存在", "Product not exist"),

	E_00008("AES 加密异常", "AES encrypt error"),

	E_00009("AES 解密异常", "AES decrypt error"),

	E_00010("对象拷贝失败", "Object copy error"),

	E_00011("文件下载异常", "Download file error"),

	E_00012("写入文件失败", "Write wo file error"),;

	/**
	 * 中文描述
	 */
	private String messageCN;

	/**
	 * 英文描述
	 */
	private String messageUS;

	/**
	 * 构造函数
	 * 
	 * @param messageCN
	 *            中文描述
	 * @param messageUS
	 *            英文描述
	 */
	private ErrorCode(String messageCN, String messageUS) {
		this.messageCN = messageCN;
		this.messageUS = messageUS;
	}

	public String getMessageCN() {
		return messageCN;
	}

	public String getMessageUS() {
		return messageUS;
	}

}
