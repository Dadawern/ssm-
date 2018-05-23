package com.dadawern.dto;

/**
 * ��װjson�������з��ؽ����ʹ����
 */

/**
 * @author Dadawern
 *
 * @param <T>
 */
public class Result<T> {

	private boolean success; //�Ƿ�ɹ���־
	
	private T data; //�ɹ�����ʱ������
	
	private String error; //������Ϣ

	//�ɹ�ʱ�Ĺ�����
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}
 
	//ʧ��ʱ�Ĺ�����
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	public Result() {
	
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "JsonResult [success=" + success + ", data=" + data + ", error=" + error + "]";
	}
	
   
}
