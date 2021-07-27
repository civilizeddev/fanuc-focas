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
public class PNC_SETTING_PARAM_W extends Structure {
	public byte PnControllerMode;
	public byte pad;
	public byte BasicOption1;
	public byte reserve1;
	public PNC_ADDRTOP DiAddrTop;
	public PNC_ADDRTOP DoAddrTop;
	public PNC_ADDR Status;
	public byte[] reserve2 = new byte[12];
	public PNC_SETTING_PARAM_W() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("PnControllerMode", "pad", "BasicOption1", "reserve1", "DiAddrTop", "DoAddrTop", "Status", "reserve2");
	}
	public PNC_SETTING_PARAM_W(byte PnControllerMode, byte pad, byte BasicOption1, byte reserve1, PNC_ADDRTOP DiAddrTop, PNC_ADDRTOP DoAddrTop, PNC_ADDR Status, byte reserve2[]) {
		super();
		this.PnControllerMode = PnControllerMode;
		this.pad = pad;
		this.BasicOption1 = BasicOption1;
		this.reserve1 = reserve1;
		this.DiAddrTop = DiAddrTop;
		this.DoAddrTop = DoAddrTop;
		this.Status = Status;
		if ((reserve2.length != this.reserve2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve2 = reserve2;
	}
	public PNC_SETTING_PARAM_W(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PNC_SETTING_PARAM_W implements Structure.ByReference {
		
	};
	public static class ByValue extends PNC_SETTING_PARAM_W implements Structure.ByValue {
		
	};
}
