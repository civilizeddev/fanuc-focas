package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class iodbpunch1_ex extends Structure {
	public short number;
	public short attr;
	public u_union u;
	public short decimal;
	public short reserve;
	public static class u_union extends Union {
		public short u2data;
		public short s2data;
		public NativeLong u4data;
		public NativeLong s4data;
		public NativeLong[] u8data = new NativeLong[2];
		public u_union() {
			super();
		}
		public u_union(short u2data_or_s2data) {
			super();
			this.s2data = this.u2data = u2data_or_s2data;
			setType(Short.TYPE);
		}
		public u_union(NativeLong u4data_or_s4data) {
			super();
			this.s4data = this.u4data = u4data_or_s4data;
			setType(NativeLong.class);
		}
		public u_union(NativeLong u8data[]) {
			super();
			if ((u8data.length != this.u8data.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.u8data = u8data;
			setType(NativeLong[].class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public iodbpunch1_ex() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("number", "attr", "u", "decimal", "reserve");
	}
	public iodbpunch1_ex(short number, short attr, u_union u, short decimal, short reserve) {
		super();
		this.number = number;
		this.attr = attr;
		this.u = u;
		this.decimal = decimal;
		this.reserve = reserve;
	}
	public iodbpunch1_ex(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbpunch1_ex implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbpunch1_ex implements Structure.ByValue {
		
	};
}
