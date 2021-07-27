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
public class iodbhpst extends Structure {
	public short slct;
	public short hpcc;
	public short multi;
	public short ovr1;
	public short ign_f;
	public short foward;
	public NativeLong max_f;
	public short ovr2;
	public short ovr3;
	public short ovr4;
	public NativeLong[] reserve = new NativeLong[7];
	public iodbhpst() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slct", "hpcc", "multi", "ovr1", "ign_f", "foward", "max_f", "ovr2", "ovr3", "ovr4", "reserve");
	}
	public iodbhpst(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbhpst implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbhpst implements Structure.ByValue {
		
	};
}
