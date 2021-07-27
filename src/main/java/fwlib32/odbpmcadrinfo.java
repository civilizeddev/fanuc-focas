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
public class odbpmcadrinfo extends Structure {
	/** j PMC unittype */
	public short sPmcUnit;
	/** j ID code indicating the PMC address type */
	public short sAdrType;
	/** j number of PMC address */
	public NativeLong iAdrNum;
	/** j bit position of PMC address */
	public short sBitPos;
	/** j deta type of PMC address */
	public short sDataType;
	public odbpmcadrinfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("sPmcUnit", "sAdrType", "iAdrNum", "sBitPos", "sDataType");
	}
	public odbpmcadrinfo(short sPmcUnit, short sAdrType, NativeLong iAdrNum, short sBitPos, short sDataType) {
		super();
		this.sPmcUnit = sPmcUnit;
		this.sAdrType = sAdrType;
		this.iAdrNum = iAdrNum;
		this.sBitPos = sBitPos;
		this.sDataType = sDataType;
	}
	public odbpmcadrinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpmcadrinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpmcadrinfo implements Structure.ByValue {
		
	};
}
