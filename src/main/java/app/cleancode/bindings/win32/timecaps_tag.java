// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class timecaps_tag {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMin"),
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMax")
    ).withName("timecaps_tag");
    public static MemoryLayout $LAYOUT() {
        return timecaps_tag.$struct$LAYOUT;
    }
    static final VarHandle wPeriodMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMin"));
    public static VarHandle wPeriodMin$VH() {
        return timecaps_tag.wPeriodMin$VH;
    }
    public static int wPeriodMin$get(MemorySegment seg) {
        return (int)timecaps_tag.wPeriodMin$VH.get(seg);
    }
    public static void wPeriodMin$set( MemorySegment seg, int x) {
        timecaps_tag.wPeriodMin$VH.set(seg, x);
    }
    public static int wPeriodMin$get(MemorySegment seg, long index) {
        return (int)timecaps_tag.wPeriodMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMin$set(MemorySegment seg, long index, int x) {
        timecaps_tag.wPeriodMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPeriodMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMax"));
    public static VarHandle wPeriodMax$VH() {
        return timecaps_tag.wPeriodMax$VH;
    }
    public static int wPeriodMax$get(MemorySegment seg) {
        return (int)timecaps_tag.wPeriodMax$VH.get(seg);
    }
    public static void wPeriodMax$set( MemorySegment seg, int x) {
        timecaps_tag.wPeriodMax$VH.set(seg, x);
    }
    public static int wPeriodMax$get(MemorySegment seg, long index) {
        return (int)timecaps_tag.wPeriodMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMax$set(MemorySegment seg, long index, int x) {
        timecaps_tag.wPeriodMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


