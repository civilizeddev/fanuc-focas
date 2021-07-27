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
public class iodbwave extends Structure {
	public short condition;
	public byte trg_adr;
	public byte trg_bit;
	public short trg_no;
	public short delay;
	public short t_range;
	public iodbwave.ch_struct[] ch = new iodbwave.ch_struct[12];
	public static class ch_struct extends Structure {
		public short kind;
		public u_union u;
		public static class u_union extends Union {
			public NativeLong axis;
			public io_struct io;
			public static class io_struct extends Structure {
				public byte adr;
				public byte bit;
				public short no;
				public io_struct() {
					super();
				}
				protected List<String> getFieldOrder() {
					return Arrays.asList("adr", "bit", "no");
				}
				public io_struct(byte adr, byte bit, short no) {
					super();
					this.adr = adr;
					this.bit = bit;
					this.no = no;
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
			public u_union(NativeLong axis) {
				super();
				this.axis = axis;
				setType(NativeLong.class);
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
		public ch_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("kind", "u");
		}
		public ch_struct(short kind, u_union u) {
			super();
			this.kind = kind;
			this.u = u;
		}
		public ch_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends ch_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends ch_struct implements Structure.ByValue {
			
		};
	};
	public iodbwave() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("condition", "trg_adr", "trg_bit", "trg_no", "delay", "t_range", "ch");
	}
	public iodbwave(short condition, byte trg_adr, byte trg_bit, short trg_no, short delay, short t_range, iodbwave.ch_struct ch[]) {
		super();
		this.condition = condition;
		this.trg_adr = trg_adr;
		this.trg_bit = trg_bit;
		this.trg_no = trg_no;
		this.delay = delay;
		this.t_range = t_range;
		if ((ch.length != this.ch.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ch = ch;
	}
	public iodbwave(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbwave implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbwave implements Structure.ByValue {
		
	};
}
