package fwlib32;
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
public class odbwvdt3 extends Structure {
	public short channel;
	public short kind;
	public u_union u;
	public byte year;
	public byte month;
	public byte day;
	public byte hour;
	public byte minute;
	public byte second;
	public short t_cycle;
	public short[] data = new short[8192];
	public static class u_union extends Union {
		public ax_struct ax;
		public io_struct io;
		public static class ax_struct extends Structure {
			public short axis;
			public short[] reserve = new short[3];
			public ax_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("axis", "reserve");
			}
			public ax_struct(short axis, short reserve[]) {
				super();
				this.axis = axis;
				if ((reserve.length != this.reserve.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.reserve = reserve;
			}
			public ax_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends ax_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends ax_struct implements Structure.ByValue {
				
			};
		};
		public static class io_struct extends Structure {
			public short unittype;
			public byte adr;
			public byte bit;
			public short no;
			public short reserve;
			public io_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("unittype", "adr", "bit", "no", "reserve");
			}
			public io_struct(short unittype, byte adr, byte bit, short no, short reserve) {
				super();
				this.unittype = unittype;
				this.adr = adr;
				this.bit = bit;
				this.no = no;
				this.reserve = reserve;
			}
			public io_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends io_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends io_struct implements Structure.ByValue {
				
			};
		};
		public u_union() {
			super();
		}
		public u_union(ax_struct ax) {
			super();
			this.ax = ax;
			setType(ax_struct.class);
		}
		public u_union(io_struct io) {
			super();
			this.io = io;
			setType(io_struct.class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public odbwvdt3() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("channel", "kind", "u", "year", "month", "day", "hour", "minute", "second", "t_cycle", "data");
	}
	public odbwvdt3(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbwvdt3 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbwvdt3 implements Structure.ByValue {
		
	};
}
