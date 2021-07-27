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
public class odbahis2 extends Structure {
	/** start number */
	public short s_no;
	/** end number */
	public short e_no;
	public fwlib32.odbahis.alm_his_struct[] alm_his = new fwlib32.odbahis.alm_his_struct[10];
	public static class alm_his_struct extends Structure {
		/** alarm group */
		public short alm_grp;
		/** alarm number */
		public short alm_no;
		/** axis number */
		public short axis_no;
		/** year */
		public short year;
		/** month */
		public short month;
		/** day */
		public short day;
		/** hour */
		public short hour;
		/** minute */
		public short minute;
		/** second */
		public short second;
		/** alarm message length */
		public short len_msg;
		/** alarm message */
		public byte[] alm_msg = new byte[32];
		public alm_his_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("alm_grp", "alm_no", "axis_no", "year", "month", "day", "hour", "minute", "second", "len_msg", "alm_msg");
		}
		public alm_his_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends alm_his_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends alm_his_struct implements Structure.ByValue {
			
		};
	};
	public odbahis2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("s_no", "e_no", "alm_his");
	}
	public odbahis2(short s_no, short e_no, fwlib32.odbahis.alm_his_struct alm_his[]) {
		super();
		this.s_no = s_no;
		this.e_no = e_no;
		if ((alm_his.length != this.alm_his.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.alm_his = alm_his;
	}
	public odbahis2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbahis2 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbahis2 implements Structure.ByValue {
		
	};
}
