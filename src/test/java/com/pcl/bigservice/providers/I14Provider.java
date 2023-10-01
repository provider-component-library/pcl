package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I14Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i20Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i32Provider;
    @Hard
    private final Provider<Integer> i33Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b14Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b16Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b17Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b22Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b26Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b32Provider.get(request);
		int p16Val = b39Provider.get(request);
		int p17Val = b40Provider.get(request);
		int p18Val = b45Provider.get(request);
		int p19Val = b47Provider.get(request);
		int p20Val = b49Provider.get(request);
		int p21Val = i18Provider.get(request);
		int p22Val = i20Provider.get(request);
		int p23Val = i27Provider.get(request);
		int p24Val = i30Provider.get(request);
		int p25Val = i31Provider.get(request);
		int p26Val = i32Provider.get(request);
		int p27Val = i33Provider.get(request);
		int p28Val = i34Provider.get(request);
		int p29Val = i37Provider.get(request);
		int p30Val = i39Provider.get(request);
		int p31Val = i46Provider.get(request);
		int p32Val = i52Provider.get(request);
		int p33Val = i53Provider.get(request);
		int p34Val = i54Provider.get(request);
		int p35Val = i56Provider.get(request);
		int p36Val = i59Provider.get(request);
		int p37Val = i60Provider.get(request);
		int p38Val = i67Provider.get(request);
		int p39Val = i73Provider.get(request);
		int p40Val = i74Provider.get(request);
		int p41Val = i78Provider.get(request);
		int p42Val = i81Provider.get(request);
		int p43Val = i82Provider.get(request);
		int p44Val = i85Provider.get(request);
		int p45Val = i87Provider.get(request);
		int p46Val = i88Provider.get(request);
		int p47Val = i91Provider.get(request);
		int p48Val = i92Provider.get(request);
		int p49Val = i93Provider.get(request);
		
        try {
            Thread.sleep(53);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p50Val = i94Provider.get(request);
		int p51Val = i97Provider.get(request);
		int p52Val = i99Provider.get(request);
		int p53Val = i108Provider.get(request);
		int p54Val = i109Provider.get(request);
		int p55Val = i110Provider.get(request);
		int p56Val = i112Provider.get(request);
		int p57Val = i118Provider.get(request);
		int p58Val = i121Provider.get(request);
		int p59Val = i124Provider.get(request);
		int p60Val = i125Provider.get(request);
		int p61Val = i132Provider.get(request);
		int p62Val = i135Provider.get(request);
		int p63Val = i136Provider.get(request);
		int p64Val = i139Provider.get(request);
		int p65Val = i141Provider.get(request);
		int p66Val = i143Provider.get(request);
		int p67Val = i154Provider.get(request);
		int p68Val = i156Provider.get(request);
		int p69Val = i158Provider.get(request);
		int p70Val = i159Provider.get(request);
		int p71Val = i160Provider.get(request);
		int p72Val = i161Provider.get(request);
		int p73Val = i165Provider.get(request);
		
        try {
            Thread.sleep(37);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p74Val = i167Provider.get(request);
		int p75Val = i169Provider.get(request);
		int p76Val = i172Provider.get(request);
		int p77Val = i177Provider.get(request);
		int p78Val = i178Provider.get(request);
		int p79Val = i179Provider.get(request);
		int p80Val = i180Provider.get(request);
		int p81Val = i184Provider.get(request);
		int p82Val = i190Provider.get(request);
		int p83Val = i192Provider.get(request);
		int p84Val = i193Provider.get(request);
		int p85Val = i194Provider.get(request);
		int p86Val = i196Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val +
				p83Val +
				p84Val +
				p85Val +
				p86Val;
    }
}
