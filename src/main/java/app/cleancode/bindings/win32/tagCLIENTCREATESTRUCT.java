// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCLIENTCREATESTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hWindowMenu"),
        Constants$root.C_LONG$LAYOUT.withName("idFirstChild"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagCLIENTCREATESTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagCLIENTCREATESTRUCT.$struct$LAYOUT;
    }
    static final VarHandle hWindowMenu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWindowMenu"));
    public static VarHandle hWindowMenu$VH() {
        return tagCLIENTCREATESTRUCT.hWindowMenu$VH;
    }
    public static MemoryAddress hWindowMenu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCLIENTCREATESTRUCT.hWindowMenu$VH.get(seg);
    }
    public static void hWindowMenu$set( MemorySegment seg, MemoryAddress x) {
        tagCLIENTCREATESTRUCT.hWindowMenu$VH.set(seg, x);
    }
    public static MemoryAddress hWindowMenu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCLIENTCREATESTRUCT.hWindowMenu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWindowMenu$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCLIENTCREATESTRUCT.hWindowMenu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle idFirstChild$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("idFirstChild"));
    public static VarHandle idFirstChild$VH() {
        return tagCLIENTCREATESTRUCT.idFirstChild$VH;
    }
    public static int idFirstChild$get(MemorySegment seg) {
        return (int)tagCLIENTCREATESTRUCT.idFirstChild$VH.get(seg);
    }
    public static void idFirstChild$set( MemorySegment seg, int x) {
        tagCLIENTCREATESTRUCT.idFirstChild$VH.set(seg, x);
    }
    public static int idFirstChild$get(MemorySegment seg, long index) {
        return (int)tagCLIENTCREATESTRUCT.idFirstChild$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void idFirstChild$set(MemorySegment seg, long index, int x) {
        tagCLIENTCREATESTRUCT.idFirstChild$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


