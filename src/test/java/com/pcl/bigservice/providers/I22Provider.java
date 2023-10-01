package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I22Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i28Provider;
    @Hard
    private final Provider<Integer> i29Provider;
    @Hard
    private final Provider<Integer> i30Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i51Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i83Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b21Provider.get(request);
		int p7Val = b24Provider.get(request);
		int p8Val = b25Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b26Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b42Provider.get(request);
		int p15Val = b46Provider.get(request);
		int p16Val = b48Provider.get(request);
		int p17Val = i27Provider.get(request);
		int p18Val = i28Provider.get(request);
		int p19Val = i29Provider.get(request);
		int p20Val = i30Provider.get(request);
		int p21Val = i34Provider.get(request);
		int p22Val = i35Provider.get(request);
		int p23Val = i36Provider.get(request);
		int p24Val = i37Provider.get(request);
		int p25Val = i38Provider.get(request);
		int p26Val = i39Provider.get(request);
		int p27Val = i41Provider.get(request);
		int p28Val = i42Provider.get(request);
		int p29Val = i46Provider.get(request);
		int p30Val = i51Provider.get(request);
		int p31Val = i52Provider.get(request);
		int p32Val = i53Provider.get(request);
		int p33Val = i55Provider.get(request);
		int p34Val = i56Provider.get(request);
		int p35Val = i58Provider.get(request);
		int p36Val = i59Provider.get(request);
		int p37Val = i60Provider.get(request);
		int p38Val = i64Provider.get(request);
		int p39Val = i67Provider.get(request);
		int p40Val = i68Provider.get(request);
		int p41Val = i69Provider.get(request);
		int p42Val = i71Provider.get(request);
		int p43Val = i72Provider.get(request);
		int p44Val = i74Provider.get(request);
		int p45Val = i79Provider.get(request);
		int p46Val = i80Provider.get(request);
		int p47Val = i81Provider.get(request);
		
        try {
            Thread.sleep(63);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i83Provider.get(request);
		int p49Val = i84Provider.get(request);
		int p50Val = i86Provider.get(request);
		int p51Val = i88Provider.get(request);
		int p52Val = i89Provider.get(request);
		int p53Val = i90Provider.get(request);
		int p54Val = i91Provider.get(request);
		int p55Val = i95Provider.get(request);
		int p56Val = i97Provider.get(request);
		int p57Val = i98Provider.get(request);
		int p58Val = i99Provider.get(request);
		int p59Val = i101Provider.get(request);
		int p60Val = i102Provider.get(request);
		int p61Val = i103Provider.get(request);
		int p62Val = i105Provider.get(request);
		int p63Val = i107Provider.get(request);
		int p64Val = i109Provider.get(request);
		int p65Val = i111Provider.get(request);
		int p66Val = i112Provider.get(request);
		int p67Val = i115Provider.get(request);
		int p68Val = i117Provider.get(request);
		int p69Val = i118Provider.get(request);
		int p70Val = i121Provider.get(request);
		int p71Val = i130Provider.get(request);
		int p72Val = i131Provider.get(request);
		int p73Val = i133Provider.get(request);
		int p74Val = i137Provider.get(request);
		int p75Val = i139Provider.get(request);
		
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p76Val = i141Provider.get(request);
		int p77Val = i142Provider.get(request);
		int p78Val = i147Provider.get(request);
		int p79Val = i148Provider.get(request);
		int p80Val = i151Provider.get(request);
		int p81Val = i158Provider.get(request);
		int p82Val = i159Provider.get(request);
		int p83Val = i160Provider.get(request);
		int p84Val = i162Provider.get(request);
		int p85Val = i163Provider.get(request);
		int p86Val = i165Provider.get(request);
		int p87Val = i166Provider.get(request);
		int p88Val = i167Provider.get(request);
		int p89Val = i173Provider.get(request);
		int p90Val = i175Provider.get(request);
		int p91Val = i177Provider.get(request);
		int p92Val = i180Provider.get(request);
		int p93Val = i185Provider.get(request);
		int p94Val = i188Provider.get(request);
		int p95Val = i189Provider.get(request);
		int p96Val = i191Provider.get(request);
		int p97Val = i194Provider.get(request);
		int p98Val = i197Provider.get(request);

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
				p86Val +
				p87Val +
				p88Val +
				p89Val +
				p90Val +
				p91Val +
				p92Val +
				p93Val +
				p94Val +
				p95Val +
				p96Val +
				p97Val +
				p98Val;
    }
}
