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
public class unsolicmsg_type_prm extends Structure {
	public short type;
	public byte[] dummy1 = new byte[2];
	public prm_union prm;
	public static class prm_union extends Union {
		public pmc_struct pmc;
		public macro_struct macro;
		public static class pmc_struct extends Structure {
			public short path;
			public short addr;
			public NativeLong no;
			public NativeLong size;
			public pmc_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("path", "addr", "no", "size");
			}
			public pmc_struct(short path, short addr, NativeLong no, NativeLong size) {
				super();
				this.path = path;
				this.addr = addr;
				this.no = no;
				this.size = size;
			}
			public pmc_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends pmc_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends pmc_struct implements Structure.ByValue {
				
			};
		};
		public static class macro_struct extends Structure {
			public short path;
			public byte[] dummy2 = new byte[2];
			public NativeLong no;
			public NativeLong num;
			public macro_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("path", "dummy2", "no", "num");
			}
			public macro_struct(short path, byte dummy2[], NativeLong no, NativeLong num) {
				super();
				this.path = path;
				if ((dummy2.length != this.dummy2.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.dummy2 = dummy2;
				this.no = no;
				this.num = num;
			}
			public macro_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends macro_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends macro_struct implements Structure.ByValue {
				
			};
		};
		public prm_union() {
			super();
		}
		public prm_union(pmc_struct pmc) {
			super();
			this.pmc = pmc;
			setType(pmc_struct.class);
		}
		public prm_union(macro_struct macro) {
			super();
			this.macro = macro;
			setType(macro_struct.class);
		}
		public prm_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends prm_union implements Structure.ByReference {
			
		};
		public static class ByValue extends prm_union implements Structure.ByValue {
			
		};
	};
	public unsolicmsg_type_prm() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("type", "dummy1", "prm");
	}
	public unsolicmsg_type_prm(short type, byte dummy1[], prm_union prm) {
		super();
		this.type = type;
		if ((dummy1.length != this.dummy1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy1 = dummy1;
		this.prm = prm;
	}
	public unsolicmsg_type_prm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends unsolicmsg_type_prm implements Structure.ByReference {
		
	};
	public static class ByValue extends unsolicmsg_type_prm implements Structure.ByValue {
		
	};
}
