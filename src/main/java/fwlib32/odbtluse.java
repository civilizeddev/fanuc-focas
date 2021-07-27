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
public class odbtluse extends Structure {
	/** start group number */
	public short s_grp;
	/** dummy */
	public short dummy;
	/** end group number */
	public short e_grp;
	/** tool using number */
	public NativeLong[] data = new NativeLong[5];
	public odbtluse() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("s_grp", "dummy", "e_grp", "data");
	}
	public odbtluse(short s_grp, short dummy, short e_grp, NativeLong data[]) {
		super();
		this.s_grp = s_grp;
		this.dummy = dummy;
		this.e_grp = e_grp;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public odbtluse(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbtluse implements Structure.ByReference {
		
	};
	public static class ByValue extends odbtluse implements Structure.ByValue {
		
	};
}
