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
public class OUT_DNMPRM_BUS2 extends Structure {
	public short Network;
	public short BaudRate;
	public short DiDataOnAbnormal;
	public short OwnMacId;
	public PMC_REG CommonStatus;
	public short CommonStatusSize;
	public short CycleTimeSetting;
	public short CycleTimeCurrent;
	public short CycleTimeMaximum;
	public short CycleTimeMinimum;
	public short RefreshTime;
	public short Option;
	public short reserved;
	public OUT_DNMPRM_BUS2() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Network", "BaudRate", "DiDataOnAbnormal", "OwnMacId", "CommonStatus", "CommonStatusSize", "CycleTimeSetting", "CycleTimeCurrent", "CycleTimeMaximum", "CycleTimeMinimum", "RefreshTime", "Option", "reserved");
	}
	public OUT_DNMPRM_BUS2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNMPRM_BUS2 implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNMPRM_BUS2 implements Structure.ByValue {
		
	};
}
