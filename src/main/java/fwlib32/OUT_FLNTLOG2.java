package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_FLNTLOG2 extends Structure {
	public NativeLong TotalSend;
	public NativeLong SendErr;
	public NativeLong TotalRecv;
	public NativeLong RecvErr;
	public NativeLong CycErr;
	public NativeLong MsgRetry;
	public NativeLong MsgRetryOver;
	public NativeLong RecvMsgErr;
	public NativeLong AckErr;
	public NativeLong DuplicatedToken;
	public NativeLong DestroyedToken;
	public NativeLong ReissueToken;
	public NativeLong FrameWait;
	public NativeLong Entry;
	public NativeLong OutRing;
	public NativeLong Skip;
	public NativeLong Disconnect;
	public short Baudrate;
	public byte[] Reserved = new byte[2];
	public OUT_FLNTLOG2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("TotalSend", "SendErr", "TotalRecv", "RecvErr", "CycErr", "MsgRetry", "MsgRetryOver", "RecvMsgErr", "AckErr", "DuplicatedToken", "DestroyedToken", "ReissueToken", "FrameWait", "Entry", "OutRing", "Skip", "Disconnect", "Baudrate", "Reserved");
	}
	public OUT_FLNTLOG2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_FLNTLOG2 implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_FLNTLOG2 implements Structure.ByValue {
		
	};
}
