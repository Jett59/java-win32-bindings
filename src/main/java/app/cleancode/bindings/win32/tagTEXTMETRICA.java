// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTEXTMETRICA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("tmHeight"),
        Constants$root.C_LONG$LAYOUT.withName("tmAscent"),
        Constants$root.C_LONG$LAYOUT.withName("tmDescent"),
        Constants$root.C_LONG$LAYOUT.withName("tmInternalLeading"),
        Constants$root.C_LONG$LAYOUT.withName("tmExternalLeading"),
        Constants$root.C_LONG$LAYOUT.withName("tmAveCharWidth"),
        Constants$root.C_LONG$LAYOUT.withName("tmMaxCharWidth"),
        Constants$root.C_LONG$LAYOUT.withName("tmWeight"),
        Constants$root.C_LONG$LAYOUT.withName("tmOverhang"),
        Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectX"),
        Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectY"),
        Constants$root.C_CHAR$LAYOUT.withName("tmFirstChar"),
        Constants$root.C_CHAR$LAYOUT.withName("tmLastChar"),
        Constants$root.C_CHAR$LAYOUT.withName("tmDefaultChar"),
        Constants$root.C_CHAR$LAYOUT.withName("tmBreakChar"),
        Constants$root.C_CHAR$LAYOUT.withName("tmItalic"),
        Constants$root.C_CHAR$LAYOUT.withName("tmUnderlined"),
        Constants$root.C_CHAR$LAYOUT.withName("tmStruckOut"),
        Constants$root.C_CHAR$LAYOUT.withName("tmPitchAndFamily"),
        Constants$root.C_CHAR$LAYOUT.withName("tmCharSet"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagTEXTMETRICA");
    public static MemoryLayout $LAYOUT() {
        return tagTEXTMETRICA.$struct$LAYOUT;
    }
    static final VarHandle tmHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmHeight"));
    public static VarHandle tmHeight$VH() {
        return tagTEXTMETRICA.tmHeight$VH;
    }
    public static int tmHeight$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmHeight$VH.get(seg);
    }
    public static void tmHeight$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmHeight$VH.set(seg, x);
    }
    public static int tmHeight$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmHeight$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAscent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmAscent"));
    public static VarHandle tmAscent$VH() {
        return tagTEXTMETRICA.tmAscent$VH;
    }
    public static int tmAscent$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmAscent$VH.get(seg);
    }
    public static void tmAscent$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmAscent$VH.set(seg, x);
    }
    public static int tmAscent$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmAscent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAscent$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmAscent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDescent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDescent"));
    public static VarHandle tmDescent$VH() {
        return tagTEXTMETRICA.tmDescent$VH;
    }
    public static int tmDescent$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmDescent$VH.get(seg);
    }
    public static void tmDescent$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmDescent$VH.set(seg, x);
    }
    public static int tmDescent$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmDescent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDescent$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmDescent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmInternalLeading$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmInternalLeading"));
    public static VarHandle tmInternalLeading$VH() {
        return tagTEXTMETRICA.tmInternalLeading$VH;
    }
    public static int tmInternalLeading$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmInternalLeading$VH.get(seg);
    }
    public static void tmInternalLeading$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmInternalLeading$VH.set(seg, x);
    }
    public static int tmInternalLeading$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmInternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmInternalLeading$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmInternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmExternalLeading$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmExternalLeading"));
    public static VarHandle tmExternalLeading$VH() {
        return tagTEXTMETRICA.tmExternalLeading$VH;
    }
    public static int tmExternalLeading$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmExternalLeading$VH.get(seg);
    }
    public static void tmExternalLeading$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmExternalLeading$VH.set(seg, x);
    }
    public static int tmExternalLeading$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmExternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmExternalLeading$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmExternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAveCharWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmAveCharWidth"));
    public static VarHandle tmAveCharWidth$VH() {
        return tagTEXTMETRICA.tmAveCharWidth$VH;
    }
    public static int tmAveCharWidth$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmAveCharWidth$VH.get(seg);
    }
    public static void tmAveCharWidth$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmAveCharWidth$VH.set(seg, x);
    }
    public static int tmAveCharWidth$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmAveCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAveCharWidth$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmAveCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmMaxCharWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmMaxCharWidth"));
    public static VarHandle tmMaxCharWidth$VH() {
        return tagTEXTMETRICA.tmMaxCharWidth$VH;
    }
    public static int tmMaxCharWidth$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmMaxCharWidth$VH.get(seg);
    }
    public static void tmMaxCharWidth$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmMaxCharWidth$VH.set(seg, x);
    }
    public static int tmMaxCharWidth$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmMaxCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmMaxCharWidth$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmMaxCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmWeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmWeight"));
    public static VarHandle tmWeight$VH() {
        return tagTEXTMETRICA.tmWeight$VH;
    }
    public static int tmWeight$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmWeight$VH.get(seg);
    }
    public static void tmWeight$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmWeight$VH.set(seg, x);
    }
    public static int tmWeight$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmWeight$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmOverhang$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmOverhang"));
    public static VarHandle tmOverhang$VH() {
        return tagTEXTMETRICA.tmOverhang$VH;
    }
    public static int tmOverhang$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmOverhang$VH.get(seg);
    }
    public static void tmOverhang$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmOverhang$VH.set(seg, x);
    }
    public static int tmOverhang$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmOverhang$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmOverhang$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmOverhang$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDigitizedAspectX"));
    public static VarHandle tmDigitizedAspectX$VH() {
        return tagTEXTMETRICA.tmDigitizedAspectX$VH;
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmDigitizedAspectX$VH.get(seg);
    }
    public static void tmDigitizedAspectX$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmDigitizedAspectX$VH.set(seg, x);
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmDigitizedAspectX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectX$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmDigitizedAspectX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDigitizedAspectY"));
    public static VarHandle tmDigitizedAspectY$VH() {
        return tagTEXTMETRICA.tmDigitizedAspectY$VH;
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg) {
        return (int)tagTEXTMETRICA.tmDigitizedAspectY$VH.get(seg);
    }
    public static void tmDigitizedAspectY$set( MemorySegment seg, int x) {
        tagTEXTMETRICA.tmDigitizedAspectY$VH.set(seg, x);
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICA.tmDigitizedAspectY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectY$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICA.tmDigitizedAspectY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmFirstChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmFirstChar"));
    public static VarHandle tmFirstChar$VH() {
        return tagTEXTMETRICA.tmFirstChar$VH;
    }
    public static byte tmFirstChar$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmFirstChar$VH.get(seg);
    }
    public static void tmFirstChar$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmFirstChar$VH.set(seg, x);
    }
    public static byte tmFirstChar$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmFirstChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmFirstChar$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmFirstChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmLastChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmLastChar"));
    public static VarHandle tmLastChar$VH() {
        return tagTEXTMETRICA.tmLastChar$VH;
    }
    public static byte tmLastChar$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmLastChar$VH.get(seg);
    }
    public static void tmLastChar$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmLastChar$VH.set(seg, x);
    }
    public static byte tmLastChar$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmLastChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmLastChar$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmLastChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDefaultChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDefaultChar"));
    public static VarHandle tmDefaultChar$VH() {
        return tagTEXTMETRICA.tmDefaultChar$VH;
    }
    public static byte tmDefaultChar$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmDefaultChar$VH.get(seg);
    }
    public static void tmDefaultChar$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmDefaultChar$VH.set(seg, x);
    }
    public static byte tmDefaultChar$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmDefaultChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDefaultChar$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmDefaultChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmBreakChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmBreakChar"));
    public static VarHandle tmBreakChar$VH() {
        return tagTEXTMETRICA.tmBreakChar$VH;
    }
    public static byte tmBreakChar$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmBreakChar$VH.get(seg);
    }
    public static void tmBreakChar$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmBreakChar$VH.set(seg, x);
    }
    public static byte tmBreakChar$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmBreakChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmBreakChar$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmBreakChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmItalic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmItalic"));
    public static VarHandle tmItalic$VH() {
        return tagTEXTMETRICA.tmItalic$VH;
    }
    public static byte tmItalic$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmItalic$VH.get(seg);
    }
    public static void tmItalic$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmItalic$VH.set(seg, x);
    }
    public static byte tmItalic$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmItalic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmItalic$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmItalic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmUnderlined$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmUnderlined"));
    public static VarHandle tmUnderlined$VH() {
        return tagTEXTMETRICA.tmUnderlined$VH;
    }
    public static byte tmUnderlined$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmUnderlined$VH.get(seg);
    }
    public static void tmUnderlined$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmUnderlined$VH.set(seg, x);
    }
    public static byte tmUnderlined$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmUnderlined$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmUnderlined$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmUnderlined$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmStruckOut$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmStruckOut"));
    public static VarHandle tmStruckOut$VH() {
        return tagTEXTMETRICA.tmStruckOut$VH;
    }
    public static byte tmStruckOut$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmStruckOut$VH.get(seg);
    }
    public static void tmStruckOut$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmStruckOut$VH.set(seg, x);
    }
    public static byte tmStruckOut$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmStruckOut$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmStruckOut$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmStruckOut$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmPitchAndFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmPitchAndFamily"));
    public static VarHandle tmPitchAndFamily$VH() {
        return tagTEXTMETRICA.tmPitchAndFamily$VH;
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmPitchAndFamily$VH.get(seg);
    }
    public static void tmPitchAndFamily$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmPitchAndFamily$VH.set(seg, x);
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmPitchAndFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmPitchAndFamily$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmPitchAndFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmCharSet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmCharSet"));
    public static VarHandle tmCharSet$VH() {
        return tagTEXTMETRICA.tmCharSet$VH;
    }
    public static byte tmCharSet$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICA.tmCharSet$VH.get(seg);
    }
    public static void tmCharSet$set( MemorySegment seg, byte x) {
        tagTEXTMETRICA.tmCharSet$VH.set(seg, x);
    }
    public static byte tmCharSet$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICA.tmCharSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmCharSet$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICA.tmCharSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


