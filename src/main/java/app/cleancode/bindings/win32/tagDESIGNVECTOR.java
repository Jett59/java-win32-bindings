// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagDESIGNVECTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dvReserved"),
        Constants$root.C_LONG$LAYOUT.withName("dvNumAxes"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_LONG$LAYOUT).withName("dvValues")
    ).withName("tagDESIGNVECTOR");
    public static MemoryLayout $LAYOUT() {
        return tagDESIGNVECTOR.$struct$LAYOUT;
    }
    static final VarHandle dvReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dvReserved"));
    public static VarHandle dvReserved$VH() {
        return tagDESIGNVECTOR.dvReserved$VH;
    }
    public static int dvReserved$get(MemorySegment seg) {
        return (int)tagDESIGNVECTOR.dvReserved$VH.get(seg);
    }
    public static void dvReserved$set( MemorySegment seg, int x) {
        tagDESIGNVECTOR.dvReserved$VH.set(seg, x);
    }
    public static int dvReserved$get(MemorySegment seg, long index) {
        return (int)tagDESIGNVECTOR.dvReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dvReserved$set(MemorySegment seg, long index, int x) {
        tagDESIGNVECTOR.dvReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dvNumAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dvNumAxes"));
    public static VarHandle dvNumAxes$VH() {
        return tagDESIGNVECTOR.dvNumAxes$VH;
    }
    public static int dvNumAxes$get(MemorySegment seg) {
        return (int)tagDESIGNVECTOR.dvNumAxes$VH.get(seg);
    }
    public static void dvNumAxes$set( MemorySegment seg, int x) {
        tagDESIGNVECTOR.dvNumAxes$VH.set(seg, x);
    }
    public static int dvNumAxes$get(MemorySegment seg, long index) {
        return (int)tagDESIGNVECTOR.dvNumAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dvNumAxes$set(MemorySegment seg, long index, int x) {
        tagDESIGNVECTOR.dvNumAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dvValues$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


