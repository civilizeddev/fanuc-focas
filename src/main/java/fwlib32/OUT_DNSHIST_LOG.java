package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_DNSHIST_LOG extends Structure {
	public byte Type;
	public byte Status;
	public byte MpuStatus;
	public byte MpuFsm;
	public byte MpuAlarm;
	public byte Date;
	public byte Hour;
	public byte Minute;
	public byte Second;
	public byte[] reserved = new byte[3];
	public OUT_DNSHIST_LOG() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Type", "Status", "MpuStatus", "MpuFsm", "MpuAlarm", "Date", "Hour", "Minute", "Second", "reserved");
	}
	public OUT_DNSHIST_LOG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNSHIST_LOG implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNSHIST_LOG implements Structure.ByValue {
		
	};
}
