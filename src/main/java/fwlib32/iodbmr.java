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
public class iodbmr extends Structure {
	/** start macro number */
	public short datano_s;
	/** dummy */
	public short dummy;
	/** end macro number */
	public short datano_e;
	public fwlib32.iodbprm.data_struct[] data = new fwlib32.iodbprm.data_struct[5];
	public static class data_struct extends Structure {
		/** macro variable */
		public NativeLong mcr_val;
		/** decimal point */
		public short dec_val;
		public data_struct() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("mcr_val", "dec_val");
		}
		public data_struct(NativeLong mcr_val, short dec_val) {
			super();
			this.mcr_val = mcr_val;
			this.dec_val = dec_val;
		}
		public data_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends data_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends data_struct implements Structure.ByValue {
			
		};
	};
	public iodbmr() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano_s", "dummy", "datano_e", "data");
	}
	public iodbmr(short datano_s, short dummy, short datano_e, fwlib32.iodbprm.data_struct data[]) {
		super();
		this.datano_s = datano_s;
		this.dummy = dummy;
		this.datano_e = datano_e;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public iodbmr(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbmr implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbmr implements Structure.ByValue {
		
	};
}
