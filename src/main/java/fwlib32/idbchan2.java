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
public class idbchan2 extends Structure {
	public short chno;
	public short axis;
	public NativeLong datanum;
	public short datainf;
	public short dataadr;
	public pmc_data[] io = new pmc_data[16];
	public idbchan2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("chno", "axis", "datanum", "datainf", "dataadr", "io");
	}
	public idbchan2(short chno, short axis, NativeLong datanum, short datainf, short dataadr, pmc_data io[]) {
		super();
		this.chno = chno;
		this.axis = axis;
		this.datanum = datanum;
		this.datainf = datainf;
		this.dataadr = dataadr;
		if ((io.length != this.io.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.io = io;
	}
	public idbchan2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idbchan2 implements Structure.ByReference {
		
	};
	public static class ByValue extends idbchan2 implements Structure.ByValue {
		
	};
}
