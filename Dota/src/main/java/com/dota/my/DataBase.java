package com.dota.my;

import java.util.Vector;

public class DataBase {
    public Vector<Hero> heroes;

    public DataBase() {
        heroes = new Vector<Hero>();

        heroes.add(new Hero("Earthshaker",
                R.drawable.earthshaker_full,
                R.drawable.earthshaker_fissure_hp1,
                R.drawable.earthshaker_enchant_totem_hp1,
                R.drawable.earthshaker_aftershock_hp1,
                R.drawable.earthshaker_echo_slam_hp1));

        heroes.add(new Hero("Sven",
                R.drawable.sven_full,
                R.drawable.sven_storm_bolt_hp1,
                R.drawable.sven_great_cleave_hp1,
                R.drawable.sven_warcry_hp1,
                R.drawable.sven_gods_strength_hp1));

        heroes.add(new Hero("Tiny",
                R.drawable.tiny_full,
                R.drawable.tiny_avalanche_hp1,
                R.drawable.tiny_toss_hp1,
                R.drawable.tiny_craggy_exterior_hp1,
                R.drawable.tiny_grow_hp1));

        heroes.add(new Hero("Kunkka",
                R.drawable.kunkka_full,
                R.drawable.kunkka_torrent_hp1,
                R.drawable.kunkka_tidebringer_hp1,
                R.drawable.kunkka_x_marks_the_spot_hp1,
                R.drawable.kunkka_ghostship_hp1));

        heroes.add(new Hero("Beastmaster",
                R.drawable.beastmaster_full,
                R.drawable.beastmaster_wild_axes_hp1,
                R.drawable.beastmaster_call_of_the_wild_hp1,
                R.drawable.beastmaster_inner_beast_hp1,
                R.drawable.beastmaster_primal_roar_hp1));

        heroes.add(new Hero("DragonKnight",
                R.drawable.dragon_knight_full,
                R.drawable.dragon_knight_breathe_fire_hp1,
                R.drawable.dragon_knight_dragon_tail_hp1,
                R.drawable.dragon_knight_dragon_blood_hp1,
                R.drawable.dragon_knight_elder_dragon_form_hp1));

        heroes.add(new Hero("Clockwerk",
                R.drawable.rattletrap_full,
                R.drawable.rattletrap_battery_assault_hp1,
                R.drawable.rattletrap_power_cogs_hp1,
                R.drawable.rattletrap_rocket_flare_hp1,
                R.drawable.rattletrap_hookshot_hp1));

        heroes.add(new Hero("OmniKnight",
                R.drawable.omniknight_full,
                R.drawable.omniknight_purification_hp1,
                R.drawable.omniknight_repel_hp1,
                R.drawable.omniknight_degen_aura_hp1,
                R.drawable.omniknight_guardian_angel_hp1));

        heroes.add(new Hero("Huskar",
                R.drawable.huskar_full,
                R.drawable.huskar_inner_vitality_hp1,
                R.drawable.huskar_burning_spear_hp1,
                R.drawable.huskar_berserkers_blood_hp1,
                R.drawable.huskar_life_break_hp1));

        heroes.add(new Hero("Alchemist",
                R.drawable.alchemist_full,
                R.drawable.alchemist_acid_spray_hp1,
                R.drawable.alchemist_unstable_concoction_hp1,
                R.drawable.alchemist_goblins_greed_hp1,
                R.drawable.alchemist_chemical_rage_hp1));

        heroes.add(new Hero("Brewmaster",
                R.drawable.brewmaster_full,
                R.drawable.brewmaster_thunder_clap_hp1,
                R.drawable.brewmaster_drunken_haze_hp1,
                R.drawable.brewmaster_drunken_brawler_hp1,
                R.drawable.brewmaster_primal_split_hp1));

        heroes.add(new Hero("TreantProtector",
                R.drawable.treant_full,
                R.drawable.treant_natures_guise_hp1,
                R.drawable.treant_leech_seed_hp1,
                R.drawable.treant_living_armor_hp1,
                R.drawable.treant_overgrowth_hp1));

        heroes.add(new Hero("Io",
                R.drawable.wisp_full,
                R.drawable.wisp_tether_hp1,
                R.drawable.wisp_spirits_hp1,
                R.drawable.wisp_overcharge_hp1,
                R.drawable.wisp_relocate_hp1));

        heroes.add(new Hero("CentaurWarrunner",
                R.drawable.centaur_full,
                R.drawable.centaur_hoof_stomp_hp1,
                R.drawable.centaur_double_edge_hp1,
                R.drawable.centaur_return_hp1,
                R.drawable.centaur_stampede_hp1));

        heroes.add(new Hero("Timbersaw",
                R.drawable.shredder_full,
                R.drawable.shredder_whirling_death_hp1,
                R.drawable.shredder_timber_chain_hp1,
                R.drawable.shredder_reactive_armor_hp1,
                R.drawable.shredder_chakram_hp1));

        heroes.add(new Hero("BristleBack",
                R.drawable.bristleback_full,
                R.drawable.bristleback_viscous_nasal_goo_hp1,
                R.drawable.bristleback_quill_spray_hp1,
                R.drawable.bristleback_bristleback_hp1,
                R.drawable.bristleback_warpath_hp1));

        heroes.add(new Hero("Tuskar",
                R.drawable.tusk_full,
                R.drawable.tusk_ice_shards_hp1,
                R.drawable.tusk_snowball_hp1,
                R.drawable.tusk_frozen_sigil_hp1,
                R.drawable.tusk_walrus_punch_hp1));

        heroes.add(new Hero("ElderTitan",
                R.drawable.elder_titan_full,
                R.drawable.elder_titan_echo_stomp_hp1,
                R.drawable.elder_titan_ancestral_spirit_hp1,
                R.drawable.elder_titan_natural_order_hp1,
                R.drawable.elder_titan_earth_splitter_hp1));

        heroes.add(new Hero("Axe",
                R.drawable.axe_full,
                R.drawable.axe_berserkers_call_hp1,
                R.drawable.axe_battle_hunger_hp1,
                R.drawable.axe_counter_helix_hp1,
                R.drawable.axe_culling_blade_hp1));

        heroes.add(new Hero("Pudge",
                R.drawable.pudge_full,
                R.drawable.pudge_meat_hook_hp1,
                R.drawable.pudge_rot_hp1,
                R.drawable.pudge_flesh_heap_hp1,
                R.drawable.pudge_dismember_hp1));

        heroes.add(new Hero("SandKing",
                R.drawable.sand_king_full,
                R.drawable.sandking_burrowstrike_hp1,
                R.drawable.sandking_sand_storm_hp1,
                R.drawable.sandking_caustic_finale_hp1,
                R.drawable.sandking_epicenter_hp1));

        heroes.add(new Hero("Slardar",
                R.drawable.slardar_full,
                R.drawable.slardar_sprint_hp1,
                R.drawable.slardar_slithereen_crush_hp1,
                R.drawable.slardar_bash_hp1,
                R.drawable.slardar_amplify_damage_hp1));

        heroes.add(new Hero("Tidehunter",
                R.drawable.tidehunter_full,
                R.drawable.tidehunter_gush_hp1,
                R.drawable.tidehunter_kraken_shell_hp1,
                R.drawable.tidehunter_anchor_smash_hp1,
                R.drawable.tidehunter_ravage_hp1));

        heroes.add(new Hero("SkeletonKing",
                R.drawable.skeleton_king_full,
                R.drawable.skeleton_king_hellfire_blast_hp1,
                R.drawable.skeleton_king_vampiric_aura_hp1,
                R.drawable.skeleton_king_mortal_strike_hp1,
                R.drawable.skeleton_king_reincarnation_hp1));

        heroes.add(new Hero("Lifestealer",
                R.drawable.life_stealer_full,
                R.drawable.life_stealer_rage_hp1,
                R.drawable.life_stealer_feast_hp1,
                R.drawable.life_stealer_open_wounds_hp1,
                R.drawable.life_stealer_infest_hp1));

        heroes.add(new Hero("NightStalker",
                R.drawable.night_stalker_full,
                R.drawable.night_stalker_void_hp1,
                R.drawable.night_stalker_crippling_fear_hp1,
                R.drawable.night_stalker_hunter_in_the_night_hp1,
                R.drawable.night_stalker_darkness_hp1));

        heroes.add(new Hero("Doom",
                R.drawable.doom_bringer_full,
                R.drawable.doom_bringer_devour_hp1,
                R.drawable.doom_bringer_scorched_earth_hp1,
                R.drawable.doom_bringer_lvl_death_hp1,
                R.drawable.doom_bringer_doom_hp1));

        heroes.add(new Hero("SpiritBreaker",
                R.drawable.spirit_breaker_full,
                R.drawable.spirit_breaker_charge_of_darkness_hp1,
                R.drawable.spirit_breaker_empowering_haste_hp1,
                R.drawable.spirit_breaker_greater_bash_hp1,
                R.drawable.spirit_breaker_nether_strike_hp1));

        heroes.add(new Hero("Lycanthrope",
                R.drawable.lycan_full,
                R.drawable.lycan_summon_wolves_hp1,
                R.drawable.lycan_howl_hp1,
                R.drawable.lycan_feral_impulse_hp1,
                R.drawable.lycan_shapeshift_hp1));

        heroes.add(new Hero("ChaosKnight",
                R.drawable.chaos_knight_full,
                R.drawable.chaos_knight_chaos_bolt_hp1,
                R.drawable.chaos_knight_reality_rift_hp1,
                R.drawable.chaos_knight_chaos_strike_hp1,
                R.drawable.chaos_knight_phantasm_hp1));

        heroes.add(new Hero("Undying",
                R.drawable.undying_full,
                R.drawable.undying_decay_hp1,
                R.drawable.undying_soul_rip_hp1,
                R.drawable.undying_tombstone_hp1,
                R.drawable.undying_flesh_golem_hp1));

        heroes.add(new Hero("Magnus",
                R.drawable.magnataur_full,
                R.drawable.magnataur_shockwave_hp1,
                R.drawable.magnataur_empower_hp1,
                R.drawable.magnataur_skewer_hp1,
                R.drawable.magnataur_reverse_polarity_hp1));

        heroes.add(new Hero("Abaddon",
                R.drawable.abaddon_full,
                R.drawable.abaddon_death_coil_hp1,
                R.drawable.abaddon_aphotic_shield_hp1,
                R.drawable.abaddon_frostmourne_hp1,
                R.drawable.abaddon_borrowed_time_hp1));

        heroes.add(new Hero("AntiMage",
                R.drawable.antimage_full,
                R.drawable.antimage_mana_break_hp1,
                R.drawable.antimage_blink_hp1,
                R.drawable.antimage_spell_shield_hp1,
                R.drawable.antimage_mana_void_hp1));

        heroes.add(new Hero("DrowRanger",
                R.drawable.drow_ranger_full,
                R.drawable.drow_ranger_frost_arrows_hp1,
                R.drawable.drow_ranger_silence_hp1,
                R.drawable.drow_ranger_trueshot_hp1,
                R.drawable.drow_ranger_marksmanship_hp1));

        heroes.add(new Hero("Juggernaut",
                R.drawable.juggernaut_full,
                R.drawable.juggernaut_blade_fury_hp1,
                R.drawable.juggernaut_healing_ward_hp1,
                R.drawable.juggernaut_blade_dance_hp1,
                R.drawable.juggernaut_omni_slash_hp1));

        heroes.add(new Hero("Mirana",
                R.drawable.mirana_full,
                R.drawable.mirana_starfall_hp1,
                R.drawable.mirana_arrow_hp1,
                R.drawable.mirana_leap_hp1,
                R.drawable.mirana_invis_hp1));

        heroes.add(new Hero("Morphling",
                R.drawable.morphling_full,
                R.drawable.morphling_waveform_hp1,
                R.drawable.morphling_adaptive_strike_hp1,
                R.drawable.morphling_morph_agi_hp1,
                R.drawable.morphling_replicate_hp1));

        heroes.add(new Hero("PhantomLancer",
                R.drawable.phantom_lancer_full,
                R.drawable.phantom_lancer_spirit_lance_hp1,
                R.drawable.phantom_lancer_doppelwalk_hp1,
                R.drawable.phantom_lancer_juxtapose_hp1,
                R.drawable.phantom_lancer_phantom_edge_hp1));

        heroes.add(new Hero("VengefulSpirit",
                R.drawable.vengefulspirit_full,
                R.drawable.vengefulspirit_magic_missile_hp1,
                R.drawable.vengefulspirit_wave_of_terror_hp1,
                R.drawable.vengefulspirit_wave_of_terror_hp1,
                R.drawable.vengefulspirit_nether_swap_hp1));

        heroes.add(new Hero("Riki",
                R.drawable.riki_full,
                R.drawable.riki_smoke_screen_hp1,
                R.drawable.riki_blink_strike_hp1,
                R.drawable.riki_backstab_hp1,
                R.drawable.riki_permanent_invisibility_hp1));

        heroes.add(new Hero("Sniper",
                R.drawable.sniper_full,
                R.drawable.sniper_shrapnel_hp1,
                R.drawable.sniper_headshot_hp1,
                R.drawable.sniper_take_aim_hp1,
                R.drawable.sniper_assassinate_hp1));

        heroes.add(new Hero("TemplarAssassin",
                R.drawable.templar_assassin_full,
                R.drawable.templar_assassin_refraction_hp1,
                R.drawable.templar_assassin_meld_hp1,
                R.drawable.templar_assassin_psi_blades_hp1,
                R.drawable.templar_assassin_psionic_trap_hp1));

        heroes.add(new Hero("Luna",
                R.drawable.luna_full,
                R.drawable.luna_lucent_beam_hp1,
                R.drawable.luna_moon_glaive_hp1,
                R.drawable.luna_lunar_blessing_hp1,
                R.drawable.luna_eclipse_hp1));

        heroes.add(new Hero("BountyHunter",
                R.drawable.bounty_hunter_full,
                R.drawable.bounty_hunter_shuriken_toss_hp1,
                R.drawable.bounty_hunter_jinada_hp1,
                R.drawable.bounty_hunter_wind_walk_hp1,
                R.drawable.bounty_hunter_track_hp1));

        heroes.add(new Hero("Ursa",
                R.drawable.ursa_full,
                R.drawable.ursa_earthshock_hp1,
                R.drawable.ursa_overpower_hp1,
                R.drawable.ursa_fury_swipes_hp1,
                R.drawable.ursa_enrage_hp1));

        heroes.add(new Hero("Gyrocopter",
                R.drawable.gyrocopter_full,
                R.drawable.gyrocopter_rocket_barrage_hp1,
                R.drawable.gyrocopter_homing_missile_hp1,
                R.drawable.gyrocopter_flak_cannon_hp1,
                R.drawable.gyrocopter_call_down_hp1));

        heroes.add(new Hero("LoneDruid",
                R.drawable.lone_druid_full,
                R.drawable.lone_druid_spirit_bear_hp1,
                R.drawable.lone_druid_rabid_hp1,
                R.drawable.lone_druid_synergy_hp1,
                R.drawable.lone_druid_true_form_hp1));

        heroes.add(new Hero("NagaSiren",
                R.drawable.naga_siren_full,
                R.drawable.naga_siren_mirror_image_hp1,
                R.drawable.naga_siren_ensnare_hp1,
                R.drawable.naga_siren_rip_tide_hp1,
                R.drawable.naga_siren_song_of_the_siren_hp1));

        heroes.add(new Hero("TrollWarlord",
                R.drawable.troll_warlord_full,
                R.drawable.troll_warlord_berserkers_rage_hp1,
                R.drawable.troll_warlord_whirling_axes_ranged_hp1,
                R.drawable.troll_warlord_fervor_hp1,
                R.drawable.troll_warlord_battle_trance_hp1));

        heroes.add(new Hero("Bloodseeker",
                R.drawable.bloodseeker_full,
                R.drawable.bloodseeker_bloodrage_hp1,
                R.drawable.bloodseeker_blood_bath_hp1,
                R.drawable.bloodseeker_thirst_hp1,
                R.drawable.bloodseeker_rupture_hp1));

        heroes.add(new Hero("ShadowFiend",
                R.drawable.nevermore_full,
                R.drawable.nevermore_shadowraze1_hp1,
                R.drawable.nevermore_necromastery_hp1,
                R.drawable.nevermore_dark_lord_hp1,
                R.drawable.nevermore_requiem_hp1));

        heroes.add(new Hero("Razor",
                R.drawable.razor_full,
                R.drawable.razor_plasma_field_hp1,
                R.drawable.razor_static_link_hp1,
                R.drawable.razor_unstable_current_hp1,
                R.drawable.razor_eye_of_the_storm_hp1));

        heroes.add(new Hero("Venomancer",
                R.drawable.venomancer_full,
                R.drawable.venomancer_venomous_gale_hp1,
                R.drawable.venomancer_poison_sting_hp1,
                R.drawable.venomancer_plague_ward_hp1,
                R.drawable.venomancer_poison_nova_hp1));

        heroes.add(new Hero("FacelessVoid",
                R.drawable.faceless_void_full,
                R.drawable.faceless_void_time_walk_hp1,
                R.drawable.faceless_void_backtrack_hp1,
                R.drawable.faceless_void_time_lock_hp1,
                R.drawable.faceless_void_chronosphere_hp1));

        heroes.add(new Hero("PhantomAssassin",
                R.drawable.phantom_assassin_full,
                R.drawable.phantom_assassin_stifling_dagger_hp1,
                R.drawable.phantom_assassin_phantom_strike_hp1,
                R.drawable.phantom_assassin_blur_hp1,
                R.drawable.phantom_assassin_coup_de_grace_hp1));

        heroes.add(new Hero("Viper",
                R.drawable.viper_full,
                R.drawable.viper_poison_attack_hp1,
                R.drawable.viper_nethertoxin_hp1,
                R.drawable.viper_corrosive_skin_hp1,
                R.drawable.viper_viper_strike_hp1));

        heroes.add(new Hero("Clinkz",
                R.drawable.clinkz_full,
                R.drawable.clinkz_strafe_hp1,
                R.drawable.clinkz_searing_arrows_hp1,
                R.drawable.clinkz_wind_walk_hp1,
                R.drawable.clinkz_death_pact_hp1));

        heroes.add(new Hero("Broodmother",
                R.drawable.broodmother_full,
                R.drawable.broodmother_spawn_spiderlings_hp1,
                R.drawable.broodmother_spin_web_hp1,
                R.drawable.broodmother_incapacitating_bite_hp1,
                R.drawable.broodmother_insatiable_hunger_hp1));

        heroes.add(new Hero("Weaver",
                R.drawable.weaver_full,
                R.drawable.weaver_the_swarm_hp1,
                R.drawable.weaver_shukuchi_hp1,
                R.drawable.weaver_geminate_attack_hp1,
                R.drawable.weaver_time_lapse_hp1));

        heroes.add(new Hero("Spectre",
                R.drawable.spectre_full,
                R.drawable.spectre_spectral_dagger_hp1,
                R.drawable.spectre_desolate_hp1,
                R.drawable.spectre_dispersion_hp1,
                R.drawable.spectre_haunt_hp1));

        heroes.add(new Hero("Meepo",
                R.drawable.meepo_full,
                R.drawable.meepo_earthbind_hp1,
                R.drawable.meepo_poof_hp1,
                R.drawable.meepo_geostrike_hp1,
                R.drawable.meepo_divided_we_stand_hp1));

        heroes.add(new Hero("NyxAssassin",
                R.drawable.nyx_assassin_full,
                R.drawable.nyx_assassin_impale_hp1,
                R.drawable.nyx_assassin_mana_burn_hp1,
                R.drawable.nyx_assassin_spiked_carapace_hp1,
                R.drawable.nyx_assassin_vendetta_hp1));

        heroes.add(new Hero("Slark",
                R.drawable.slark_full,
                R.drawable.slark_dark_pact_hp1,
                R.drawable.slark_pounce_hp1,
                R.drawable.slark_essence_shift_hp1,
                R.drawable.slark_shadow_dance_hp1));

        heroes.add(new Hero("Medusa",
                R.drawable.medusa_full,
                R.drawable.medusa_split_shot_hp1,
                R.drawable.medusa_mystic_snake_hp1,
                R.drawable.medusa_mana_shield_hp1,
                R.drawable.medusa_stone_gaze_hp1));


//        heroes.add(new Hero("",
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.));
    }

    public Hero getHero(int idx) {
        return heroes.get(idx);
    }

    public int size() {
        return heroes.size();
    }
}
