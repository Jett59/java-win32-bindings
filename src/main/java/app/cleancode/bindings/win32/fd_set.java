// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fd_set {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fd_count"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(64, Constants$root.C_LONG_LONG$LAYOUT).withName("fd_array")
    ).withName("fd_set");
    public static MemoryLayout $LAYOUT() {
        return fd_set.$struct$LAYOUT;
    }
    static final VarHandle fd_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fd_count"));
    public static VarHandle fd_count$VH() {
        return fd_set.fd_count$VH;
    }
    public static int fd_count$get(MemorySegment seg) {
        return (int)fd_set.fd_count$VH.get(seg);
    }
    public static void fd_count$set( MemorySegment seg, int x) {
        fd_set.fd_count$VH.set(seg, x);
    }
    public static int fd_count$get(MemorySegment seg, long index) {
        return (int)fd_set.fd_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fd_count$set(MemorySegment seg, long index, int x) {
        fd_set.fd_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment fd_array$slice(MemorySegment seg) {
        return seg.asSlice(8, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


