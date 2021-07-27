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
public class OUT_DNMFIRM extends Structure {
	public short MpuStatus1;
	public short MpuStatus2;
	public short MasterStatus1;
	public short CanRecvCounter;
	public short CanSendCounter;
	public short CanRecvErrorCounter;
	public short CanSendErrorCounter;
	public short FirmwareVersion;
	public OUT_DNMFIRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("MpuStatus1", "MpuStatus2", "MasterStatus1", "CanRecvCounter", "CanSendCounter", "CanRecvErrorCounter", "CanSendErrorCounter", "FirmwareVersion");
	}
	public OUT_DNMFIRM(short MpuStatus1, short MpuStatus2, short MasterStatus1, short CanRecvCounter, short CanSendCounter, short CanRecvErrorCounter, short CanSendErrorCounter, short FirmwareVersion) {
		super();
		this.MpuStatus1 = MpuStatus1;
		this.MpuStatus2 = MpuStatus2;
		this.MasterStatus1 = MasterStatus1;
		this.CanRecvCounter = CanRecvCounter;
		this.CanSendCounter = CanSendCounter;
		this.CanRecvErrorCounter = CanRecvErrorCounter;
		this.CanSendErrorCounter = CanSendErrorCounter;
		this.FirmwareVersion = FirmwareVersion;
	}
	public OUT_DNMFIRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNMFIRM implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNMFIRM implements Structure.ByValue {
		
	};
}
