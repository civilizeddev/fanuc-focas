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
public class iodbwseterror extends Structure {
	/** active group number */
	public NativeLong d_no;
	/** active data */
	public NativeLong[] data_act = new NativeLong[6];
	/** decimal point for active data */
	public NativeLong[] dp_act = new NativeLong[6];
	/** axisnumber for axisname */
	public NativeLong[] dsp_ix = new NativeLong[2];
	public wseterror[] data = new wseterror[((8) * (8))];
	public iodbwseterror() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("d_no", "data_act", "dp_act", "dsp_ix", "data");
	}
	public iodbwseterror(NativeLong d_no, NativeLong data_act[], NativeLong dp_act[], NativeLong dsp_ix[], wseterror data[]) {
		super();
		this.d_no = d_no;
		if ((data_act.length != this.data_act.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data_act = data_act;
		if ((dp_act.length != this.dp_act.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dp_act = dp_act;
		if ((dsp_ix.length != this.dsp_ix.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dsp_ix = dsp_ix;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public iodbwseterror(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbwseterror implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbwseterror implements Structure.ByValue {
		
	};
}
