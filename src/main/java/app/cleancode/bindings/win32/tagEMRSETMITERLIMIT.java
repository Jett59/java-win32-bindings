// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSETMITERLIMIT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_FLOAT$LAYOUT.withName("eMiterLimit")
    ).withName("tagEMRSETMITERLIMIT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETMITERLIMIT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle eMiterLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eMiterLimit"));
    public static VarHandle eMiterLimit$VH() {
        return tagEMRSETMITERLIMIT.eMiterLimit$VH;
    }
    public static float eMiterLimit$get(MemorySegment seg) {
        return (float)tagEMRSETMITERLIMIT.eMiterLimit$VH.get(seg);
    }
    public static void eMiterLimit$set( MemorySegment seg, float x) {
        tagEMRSETMITERLIMIT.eMiterLimit$VH.set(seg, x);
    }
    public static float eMiterLimit$get(MemorySegment seg, long index) {
        return (float)tagEMRSETMITERLIMIT.eMiterLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eMiterLimit$set(MemorySegment seg, long index, float x) {
        tagEMRSETMITERLIMIT.eMiterLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

