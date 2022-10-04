// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPOLYLINE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("cptl"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("_POINTL")).withName("aptl")
    ).withName("tagEMRPOLYLINE");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPOLYLINE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle cptl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cptl"));
    public static VarHandle cptl$VH() {
        return tagEMRPOLYLINE.cptl$VH;
    }
    public static int cptl$get(MemorySegment seg) {
        return (int)tagEMRPOLYLINE.cptl$VH.get(seg);
    }
    public static void cptl$set( MemorySegment seg, int x) {
        tagEMRPOLYLINE.cptl$VH.set(seg, x);
    }
    public static int cptl$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYLINE.cptl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cptl$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYLINE.cptl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment aptl$slice(MemorySegment seg) {
        return seg.asSlice(28, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


