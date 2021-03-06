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
public class odbcrntshp extends Structure {
	public NativeLong fig_type;
	public NativeLong reserve;
	public fig_union fig;
	public byte cb_form;
	public byte[] reserve2 = new byte[7];
	public static class fig_union extends Union {
		public par_struct par;
		public cyl_struct cyl;
		public pln_struct pln;
		public static class par_struct extends Structure {
			public double[] base_pos = new double[3];
			public double[] vect1 = new double[3];
			public double[] vect2 = new double[3];
			public double[] vect3 = new double[3];
			public par_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("base_pos", "vect1", "vect2", "vect3");
			}
			public par_struct(double base_pos[], double vect1[], double vect2[], double vect3[]) {
				super();
				if ((base_pos.length != this.base_pos.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.base_pos = base_pos;
				if ((vect1.length != this.vect1.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect1 = vect1;
				if ((vect2.length != this.vect2.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect2 = vect2;
				if ((vect3.length != this.vect3.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect3 = vect3;
			}
			public par_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends par_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends par_struct implements Structure.ByValue {
				
			};
		};
		public static class cyl_struct extends Structure {
			public double[] vect1 = new double[3];
			public double[] vect2 = new double[3];
			public double v;
			public cyl_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("vect1", "vect2", "v");
			}
			public cyl_struct(double vect1[], double vect2[], double v) {
				super();
				if ((vect1.length != this.vect1.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect1 = vect1;
				if ((vect2.length != this.vect2.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect2 = vect2;
				this.v = v;
			}
			public cyl_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends cyl_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends cyl_struct implements Structure.ByValue {
				
			};
		};
		public static class pln_struct extends Structure {
			public double[] point = new double[3];
			public double[] vect = new double[3];
			public pln_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("point", "vect");
			}
			public pln_struct(double point[], double vect[]) {
				super();
				if ((point.length != this.point.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.point = point;
				if ((vect.length != this.vect.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.vect = vect;
			}
			public pln_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends pln_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends pln_struct implements Structure.ByValue {
				
			};
		};
		public fig_union() {
			super();
		}
		public fig_union(par_struct par) {
			super();
			this.par = par;
			setType(par_struct.class);
		}
		public fig_union(cyl_struct cyl) {
			super();
			this.cyl = cyl;
			setType(cyl_struct.class);
		}
		public fig_union(pln_struct pln) {
			super();
			this.pln = pln;
			setType(pln_struct.class);
		}
		public fig_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends fig_union implements Structure.ByReference {
			
		};
		public static class ByValue extends fig_union implements Structure.ByValue {
			
		};
	};
	public odbcrntshp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("fig_type", "reserve", "fig", "cb_form", "reserve2");
	}
	public odbcrntshp(NativeLong fig_type, NativeLong reserve, fig_union fig, byte cb_form, byte reserve2[]) {
		super();
		this.fig_type = fig_type;
		this.reserve = reserve;
		this.fig = fig;
		this.cb_form = cb_form;
		if ((reserve2.length != this.reserve2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve2 = reserve2;
	}
	public odbcrntshp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbcrntshp implements Structure.ByReference {
		
	};
	public static class ByValue extends odbcrntshp implements Structure.ByValue {
		
	};
}
