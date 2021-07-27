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
public class iodbpmccntl extends Structure {
	public short datano_s;
	public short dummy;
	public short datano_e;
	public fwlib32.odbparaif.info_struct[] info = new fwlib32.odbparaif.info_struct[100];
	public static class info_struct extends Structure {
		public byte tbl_prm;
		public byte data_type;
		public short data_size;
		public short data_dsp;
		public short dummy;
		public info_struct() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("tbl_prm", "data_type", "data_size", "data_dsp", "dummy");
		}
		public info_struct(byte tbl_prm, byte data_type, short data_size, short data_dsp, short dummy) {
			super();
			this.tbl_prm = tbl_prm;
			this.data_type = data_type;
			this.data_size = data_size;
			this.data_dsp = data_dsp;
			this.dummy = dummy;
		}
		public info_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends info_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends info_struct implements Structure.ByValue {
			
		};
	};
	public iodbpmccntl() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano_s", "dummy", "datano_e", "info");
	}
	public iodbpmccntl(short datano_s, short dummy, short datano_e, fwlib32.odbparaif.info_struct info[]) {
		super();
		this.datano_s = datano_s;
		this.dummy = dummy;
		this.datano_e = datano_e;
		if ((info.length != this.info.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.info = info;
	}
	public iodbpmccntl(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbpmccntl implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbpmccntl implements Structure.ByValue {
		
	};
}
