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
public class odbsinfo extends Structure {
	/** Number of S-RAM data */
	public NativeLong sramnum;
	public fwlib32.odbparaif.info_struct[] info = new fwlib32.odbparaif.info_struct[8];
	public static class info_struct extends Structure {
		/** S-RAM data Name */
		public byte[] sramname = new byte[12];
		/** S-RAM data Size */
		public NativeLong sramsize;
		/** Division number of S-RAM file */
		public short divnumber;
		/** S-RAM file names */
		public byte[] fname = new byte[((6) * (16))];
		public info_struct() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("sramname", "sramsize", "divnumber", "fname");
		}
		public info_struct(byte sramname[], NativeLong sramsize, short divnumber, byte fname[]) {
			super();
			if ((sramname.length != this.sramname.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.sramname = sramname;
			this.sramsize = sramsize;
			this.divnumber = divnumber;
			if ((fname.length != this.fname.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.fname = fname;
		}
		public info_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends info_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends info_struct implements Structure.ByValue {
			
		};
	};
	public odbsinfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("sramnum", "info");
	}
	public odbsinfo(NativeLong sramnum, fwlib32.odbparaif.info_struct info[]) {
		super();
		this.sramnum = sramnum;
		if ((info.length != this.info.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.info = info;
	}
	public odbsinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsinfo implements Structure.ByValue {
		
	};
}
