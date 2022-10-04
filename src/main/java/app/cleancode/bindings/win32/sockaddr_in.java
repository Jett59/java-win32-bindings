// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class sockaddr_in {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("sin_family"),
        Constants$root.C_SHORT$LAYOUT.withName("sin_port"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b4")
                ).withName("S_un_b"),
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                    Constants$root.C_SHORT$LAYOUT.withName("s_w2")
                ).withName("S_un_w"),
                Constants$root.C_LONG$LAYOUT.withName("S_addr")
            ).withName("S_un")
        ).withName("sin_addr"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("sin_zero")
    ).withName("sockaddr_in");
    public static MemoryLayout $LAYOUT() {
        return sockaddr_in.$struct$LAYOUT;
    }
    static final VarHandle sin_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sin_family"));
    public static VarHandle sin_family$VH() {
        return sockaddr_in.sin_family$VH;
    }
    public static short sin_family$get(MemorySegment seg) {
        return (short)sockaddr_in.sin_family$VH.get(seg);
    }
    public static void sin_family$set( MemorySegment seg, short x) {
        sockaddr_in.sin_family$VH.set(seg, x);
    }
    public static short sin_family$get(MemorySegment seg, long index) {
        return (short)sockaddr_in.sin_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sin_family$set(MemorySegment seg, long index, short x) {
        sockaddr_in.sin_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sin_port$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sin_port"));
    public static VarHandle sin_port$VH() {
        return sockaddr_in.sin_port$VH;
    }
    public static short sin_port$get(MemorySegment seg) {
        return (short)sockaddr_in.sin_port$VH.get(seg);
    }
    public static void sin_port$set( MemorySegment seg, short x) {
        sockaddr_in.sin_port$VH.set(seg, x);
    }
    public static short sin_port$get(MemorySegment seg, long index) {
        return (short)sockaddr_in.sin_port$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sin_port$set(MemorySegment seg, long index, short x) {
        sockaddr_in.sin_port$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sin_addr$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static MemorySegment sin_zero$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


